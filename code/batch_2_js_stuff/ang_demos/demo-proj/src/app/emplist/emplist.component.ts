import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-emplist',
  template: `
  <ul *ngFor = "let emp of employees">
     <li>{{emp.id}}, {{emp.name}}, {{emp.salary}}</li>
  </ul>
  
  {{errorMessage}}
  `,
  styles: []
})
export class EmplistComponent implements OnInit {

  public employees =[]
  private errorMessage: string;
  constructor(private _es: EmpService) { }
  ngOnInit() {
    this._es.getEmployees().subscribe(data=> this.employees=data, 
      err=>this.errorMessage=err);
  }

}
