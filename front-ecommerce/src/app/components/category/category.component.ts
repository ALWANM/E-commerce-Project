import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { Category } from '../../model/category.model';
import { CategoryService } from '../../services/category.service';
import {Http} from '@angular/http';
import {Router} from '@angular/router';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit {

    //list of categories
    categories : any

    currentCategory : Category

    newCategory : Category = new Category()

    //error message
    error : String

    currentIndex : number;

    //get element of the HTML page
    @ViewChild('table') table :ElementRef

    headElements = ["ID", "Name", "Description"];

  constructor(public router : Router, public http: Http, public categoryService: CategoryService) {
      
   }

  ngOnInit() {
      this.getCategories();
  }

  //get all categories
  getCategories(){
    this.categoryService.getCategories()
        .subscribe(data=>{
            //console.log(data);
            this.categories = data;
        },
        err=>{
            this.error = err;
            console.log(err);
        })
  }

  onEdit(category : Category, i : number){
      this.currentIndex = i;
      this.currentCategory = category
  }

  //delete a category
  delete(category : Category, i : number){
    this.categoryService.deleteCategory(category)
    .subscribe(data=>{
        console.log(data);
        if(data===null){
            this.categories.splice(i,1);
            alert("Category deleted successful");
        }
    },
    err =>{
        this.error = err;
        alert(this.error);
    })
  }

  //add a category
  addCategory(category : Category){
      this.categoryService.addCategory(category)
      .subscribe(data=>{
        //console.log(data);
        this.categories.push(data);
        this.newCategory = new Category();
    },
      err=>{
          this.error = err;
          console.log(err);
      })
  }

  //update a category
  update(){
      console.log(this.currentCategory)
      this.categoryService.updateCategory(this.currentCategory)
      .subscribe(data=>{
          //console.log(data);
          this.categories[this.currentIndex] = this.currentCategory;
        },
      err=>{
          this.error = err;
          console.log(err);
      })
  }
}
