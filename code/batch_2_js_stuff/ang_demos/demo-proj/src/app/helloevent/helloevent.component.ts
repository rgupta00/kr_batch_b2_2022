import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-helloevent',
  template: `
    <p>
      <button (click)=myEvent($event)>hit me</button>
    </p>
  `,
  styles: []
})
export class HelloeventComponent implements OnInit {

  counter: number=0;
  constructor() { }

  myEvent(){
    console.log(++this.counter)
    console.log(event.target)
  }
  ngOnInit() {
  }

}
