import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cal',
  template: `
    
    First no: <input [(ngModel)] ='num1' type="number" name="num1"/><br/>
    Second no: <input [(ngModel)] ='num2' type="number" name="num2"/><br/>
    {{result}}
    <button (click)="add()">calculator</button>
  `,
  styles: []
})
export class CalComponent implements OnInit {

  public num1: number=0;
  public num2: number=0;

  public result: number;

  add(){
    this.result=this.num1+ this.num2;
  }

  constructor() {
   }

  ngOnInit() {
  }

}
