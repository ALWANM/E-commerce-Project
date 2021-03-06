import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { Supplier } from '../../model/supplier.model';
import { Router } from '@angular/router';
import { Http } from '@angular/http';
import { SupplierService } from '../../services/supplier.service';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.css']
})
export class SupplierComponent implements OnInit {

    //list of suppliers
    suppliers : any
     currentSupplier : Supplier
    newSupplier : Supplier = new Supplier()

    //error message
    error : String

    currentIndex : number;

    @ViewChild('table') table : ElementRef

    headElements = ["ID", "First name", "Last name", "Mail", "Phone number", "Town"];
     
  constructor(public router: Router, public http : Http, public supplierService : SupplierService) { }

  ngOnInit() {
      this.getSuppliers();
  }

  //get all suppliers
  getSuppliers(){
      this.supplierService.getSuppliers()
      .subscribe(data=>{
          //console.log(data);
          this.suppliers = data;
      },
      err =>{
          this.error = err;
          console.log(err);
      })
  }

  //edit
  onEdit(supplier : Supplier, i : number){
      this.currentIndex = i;
      this.currentSupplier = supplier;
  }

  //delete
  onDelete(supplier : Supplier, i : number){
      this.supplierService.deleteSupplier(supplier)
      .subscribe(data=>{
        //console.log(data);
        if(data===null){
            this.suppliers.splice(i,1);
            alert("supplier deleted successful");
        }
    },
    err =>{
        this.error = err;
        alert(this.error);
    })
  }

  //add
   addSupplier(supplier : Supplier){
      this.supplierService.addSupplier(supplier)
      .subscribe(data=>{
        //console.log(data);
        this.suppliers.push(data);
        this.newSupplier = new Supplier();
    },
      err=>{
          this.error = err;
          console.log(err);
      })
  }

  //update
  update(i: number){
      this.supplierService.updateSupplier(this.currentSupplier)
      .subscribe(data=>{
          this.suppliers[i]= this.currentSupplier;
          //console.log(data);
        },
      err=>{
          this.error = err;
          console.log(err);
      })
  }
}
