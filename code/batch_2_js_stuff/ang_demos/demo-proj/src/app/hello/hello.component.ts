import { fn } from '@angular/compiler/src/output/output_ast';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  template: `
  <p [innerHTML]="fname"></p>
  <br/>
    {{fname}} <br/>
    <br/>
    {{product | json}}<br/>
    {{product.id}}<br/>
    {{product.pnam}}<br/>
     {{fullName()}}<br/>
  {{4+4}}
    <div hidden={{isHidden}}>this is hidden</div>
    <div [hidden]="isHidden">this is hidden 2</div>
  `,
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  //interpolation : used to send the data from comp-> template
   fname: string='jfdlkfjdlkfjd'
   lname: string='gupta'

   isHidden: boolean=false;

   fullName():string{
    return this.fname+ this.lname;
   }

   product: any={"id":33,"pname":"laptop","price":67555}

  constructor() { }

  ngOnInit() {
  }

}
