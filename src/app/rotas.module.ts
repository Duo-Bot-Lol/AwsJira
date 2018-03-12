import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Router, Routes, CanActivate } from "@angular/router";
import { MainPage } from '../Paginas/main/main.component';
import { LoginPage } from '../Paginas/login/login.component';


const AppRoutes: Routes = [
  { path: 'login', component: LoginPage },
  { path: 'home', component: MainPage },
  { path: '', redirectTo: 'home', pathMatch: 'full' },

]


@NgModule({
  imports: [
    RouterModule.forRoot(
        AppRoutes, { enableTracing: false }
    )
],
exports: [
    RouterModule
]
})
export class RotasModule { }
