import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { VehicleComp } from './app/vehicle-comp/vehicle-comp';

bootstrapApplication(VehicleComp, appConfig)
  .catch((err) => console.error(err));
