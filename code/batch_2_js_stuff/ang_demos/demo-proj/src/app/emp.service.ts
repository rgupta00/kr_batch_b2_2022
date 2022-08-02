import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { Employee } from './employee';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  private _url = 'http://localhost:8082/empapp/employees';

  constructor(private http: HttpClient) { }
  public getEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(this._url).pipe(catchError(this.errorHandler))
  }

  errorHandler(error: HttpErrorResponse) {
    return throwError(error.message || 'Server Error!');
  }

}
