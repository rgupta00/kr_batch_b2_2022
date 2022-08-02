import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { HelloeventComponent } from './helloevent/helloevent.component';
import { CalComponent } from './cal/cal.component';
import { FormsModule } from '@angular/forms';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { DemopipeComponent } from './demopipe/demopipe.component';
import { EmployeeTitlePipe } from './employee-title.pipe';
import { EmpComponent } from './emp/emp.component';
import { EmplistComponent } from './emplist/emplist.component';
import { EmpService } from './emp.service';
import { HttpClientModule} from '@angular/common/http';
@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    HelloeventComponent,
    CalComponent,
    EmployeelistComponent,
    DemopipeComponent,
    EmployeeTitlePipe,
    EmpComponent,
    EmplistComponent
  ],
  imports: [
    BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [EmpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
