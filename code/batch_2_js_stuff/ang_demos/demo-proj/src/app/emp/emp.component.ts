import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';
import { Employee } from '../employee';

@Component({
  selector: 'app-emp',
  template: `
    <ul *ngFor = "let emp of employees">
       <li>{{emp.name}}</li>
    </ul>
    {{errorMessage}}
  `,
  styles: []
})
export class EmpComponent implements OnInit {

  public employees =[]
  public errorMessage: string;

  constructor(private _es: EmpService) { }
  ngOnInit() {
    this._es.getEmployees().subscribe(data=> this.employees=data, 
      err=>this.errorMessage=err);
    
  }

}
