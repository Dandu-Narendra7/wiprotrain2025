import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
import { Jwttoken } from './jwttoken';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient){}

   private url:string = "http://localhost:9191/user"

  login(user:User):Observable<Jwttoken>{
    console.log('in the user service')
    return this.http.post<Jwttoken>(`${this.url}/login`, user)
  }

  getUser():Observable<User[]>{
    return this.http.get<User[]>(this.url)
  }
  
}