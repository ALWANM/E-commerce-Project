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

    suppliers : any
     currentSupplier : Supplier
    newSupplier : Supplier = new Supplier()

    error : String

    @ViewChild('table') table : ElementRef

    headElements = ["ID", "First name", "Last name", "Mail", "Phone number", "Town"];
     
  constructor(public router: Router, public http : Http, public supplierService : SupplierService) { }

  ngOnInit() {
      this.getSuppliers();
  }

  getSuppliers(){
      this.supplierService.getSuppliers()
      .subscribe(data=>{
          console.log(data);
          this.suppliers = data;
      },
      err =>{
          this.error = err;
          console.log(err);
      })
  }

  onEdit(supplier : Supplier){
      this.currentSupplier = supplier;
  }

  onDelete(supplier : Supplier){
      this.supplierService.deleteSupplier(supplier)
      .subscribe(data=>{
        console.log(data);
        if(data===null){
            alert("supplier deleted successful");
        }
    },
    err =>{
        this.error = err;
        alert(this.error);
    })
  }

   addSupplier(supplier : Supplier){
      this.supplierService.addSupplier(supplier)
      .subscribe(data=>{
        console.log(data);
        this.newSupplier = new Supplier();
    },
      err=>{
          this.error = err;
          console.log(err);
      })
  }

  update(){
      this.supplierService.updateSupplier(this.currentSupplier)
      .subscribe(data=>{
          console.log(data);
        },
      err=>{
          this.error = err;
          console.log(err);
      })
  }
}
