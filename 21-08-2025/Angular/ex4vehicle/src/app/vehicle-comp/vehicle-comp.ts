import { Component } from '@angular/core';

@Component({
  selector: 'app-vehicle-comp',
  standalone: true,
  imports: [],
  templateUrl: './vehicle-comp.html',
  styleUrl: './vehicle-comp.css'
})
export class VehicleComp implements OnInit {
  vehicles: Vehicle[] = [];

  constructor(private vehicleservice: Vehicleservice) {}

  ngOnInit() {
    this.vehicleService.getVehicles().subscribe({
      next: (data: Vehicle[]) => {
        console.log('Vehicles fetched successfully:', data);
        this.vehicles = data;
      },
      error: (error) => {
        console.error('Error fetching vehicles:', error);
      }
    });
  }

  edit(vehicleId: string) {
    this.vehicleService.getVehicleById(vehicleId).subscribe({
      next: (vehicle: Vehicle) => {
        console.log('Vehicle details:', vehicle);
        this.vehicleEdit = { ...vehicle };
      },
      error: (error) => console.error('Error fetching vehicle by ID:', error)
    });
  }

  update() {
    this.vehicleservice.updateVehicle(this.vehicleEdit).subscribe({
      next: (updatedVehicle: Vehicle) => {
        const index = this.vehicles.findIndex(v => v.id === updatedVehicle.id);
        if (index !== -1) this.vehicles[index] = updatedVehicle;
        this.vehicleEdit = { id: '', make: '', fuelType: '', model: '', price: 0 };
      },
      error: (error) => console.error('Error updating vehicle:', error)
    });
  }

  delete(vehicleId: string) {
    this.vehicleservice.deleteVehicle(vehicleId).subscribe({
      next: () => {
        this.vehicles = this.vehicles.filter(v => v.id !== vehicleId);
      },
      error: (error: any) => console.error('Error deleting vehicle:', error)
    });
  }

  save() {
    this.vehicleservice.saveVehicle(this.vehicleAdd).subscribe({
      next: (newVehicle: Vehicle) => {
        this.vehicles.push(newVehicle);
        this.vehicleAdd = { id: '', make: '', fuelType: '', model: '', price: 0 };
      },
      error: (error) => console.error('Error saving vehicle:', error)
    });
  }
}
