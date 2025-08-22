import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ivehicle } from './ivehicle';

@Injectable({
  providedIn: 'root'
})
export class Vehicleservice {
  constructor(private http:HttpClient){ }

  getvehicle():Observable<Ivehicle[]>{
    return this.http.get<Ivehicle[]> ('https://localhost:300/vehicle');
  }
  getvehicleById(vehicleId:string){
    return this.http.get<Ivehicle>('http://localhost:3000/vehicle/' + vehicleId);
  }
  updatevehicle(user: Ivehicle): Observable<Ivehicle> {
    return this.http.put<Ivehicle>('http://localhost:3000/vehicle/' , vehicle);
  }
  
}
