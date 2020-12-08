import {NgModule} from '@angular/core';
import {Routes,RouterModule} from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { OregisterComponent } from './oregister/oregister.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { OwnerdashboardComponent } from './ownerdashboard/ownerdashboard.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { MoreinfoComponent } from './moreinfo/moreinfo.component';
import { BookingsComponent } from './bookings/bookings.component';

const routes:Routes=[
    {path:"",redirectTo:"home",pathMatch:"full"},
    {path:"register" , component:RegisterComponent},
    {path:"oregister" , component:OregisterComponent},
    {path:"dashboard" , component:DashboardComponent},
    {path:"admin" , component:AdminComponent},
    {path:"ownerdashboard",component:OwnerdashboardComponent},
    {path:"adminlogin" , component:AdminloginComponent},
    {path:"moreinfo",component:MoreinfoComponent},
    {path:"bookings", component:BookingsComponent}
];
@NgModule({
    imports:[ RouterModule.forRoot(routes)],
       
    exports:[RouterModule]

})
export class AppRoutingModule{

}