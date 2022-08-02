import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demopipe',
  template: `
  
     simple date is :{{mydate}} <br/>
     medium date is :{{mydate | date: 'medium'}}  <br/>
     short date is :{{mydate | date: 'short'}} <br/>
     full date is :{{mydate | date: 'fullDate'}} <br/>
     
     currrency : {{123456 | currency: 'EUR' }} <br/>
     currrency : {{123456 | currency: 'EUR' : true }}<br/>?
      json objet: {{object | json }} <br/>
  `,
  styles: []
})
export class DemopipeComponent implements OnInit {

  mydate = Date.now();
  object: object= { fname:'rajeev', lname:'gupta' };
  constructor() { }

  ngOnInit() {
  }

}
