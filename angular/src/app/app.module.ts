import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { RegisterService } from './register.service';
import { HttpClientModule } from '@angular/common/http';

import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import { OregisterComponent } from './oregister/oregister.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import {RouterModule,Routes} from '@angular/router';
import { AdminComponent } from './admin/admin.component';

import { BookingsComponent } from './bookings/bookings.component';
import { LoginownerComponent } from './loginowner/loginowner.component';
import { OwnerdashboardComponent } from './ownerdashboard/ownerdashboard.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { FileComponent } from './file/file.component';
import { MoreinfoComponent } from './moreinfo/moreinfo.component';
import {CookieService} from 'ngx-cookie-service';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    OregisterComponent,
    HomeComponent,
    LoginComponent,
    DashboardComponent,
    AdminComponent,

    BookingsComponent,
    LoginownerComponent,
    OwnerdashboardComponent,
    AdminloginComponent,
    FileComponent,
    MoreinfoComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    
    RouterModule.forRoot([
      {path:"register",component:RegisterComponent},
      {path:"login",component:LoginComponent},
      {path:"home",component:HomeComponent},
      {path:"dashboard",component:DashboardComponent},
      {path:"admin",component:AdminComponent},
      {path:"loginowner",component:LoginownerComponent},
      {path:"ownerdashboard",component:OwnerdashboardComponent},
      {path:"adminlogin", component:AdminloginComponent},
      {path:"moreinfo" , component:MoreinfoComponent},
      {path:"bookings",component:BookingsComponent}
      
    ])

  ],
  providers: [RegisterService,CookieService],
  bootstrap: [AppComponent],
  
})
export class AppModule { }