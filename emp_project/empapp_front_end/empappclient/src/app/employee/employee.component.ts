import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  employees: Employee[];
  constructor(private employeeService: EmployeeService, private  router: Router) { }
  ngOnInit() {
    this.getEmployees();
  }
  private getEmployees(){
    this.employeeService.getEmployeesList().subscribe(data=> this.employees=data)
  }
  updateEmployee(id: number){
    console.log(`-----------`)
    this.router.navigate(['update-employee', id]);
  }
  deleteEmployee(id: number){
    this.employeeService.deleteEmployee(id).subscribe(data=>{
      this.getEmployees();
      console.log(data);
    })
  }

  employeeDetails(id: number){
    this.router.navigate(['employee-details', id]);
  }
}
