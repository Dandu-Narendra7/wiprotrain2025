import { bootstrapApplication } from '@angular/platform-browser';
import { appConfig } from './app/app.config';
import { App } from './app/app';
import { Secondcomp } from './app/secondcomp/secondcomp';
import { Logincom } from './app/logincom/logincom';
import { Thirdcom } from './app/thirdcom/thirdcom';
bootstrapApplication(Thirdcom, appConfig)
  .catch((err) => console.error(err));
