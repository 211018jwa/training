import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssociatePageComponent } from './associate-page/associate-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { TrainerPageComponent } from './trainer-page/trainer-page.component';

const routes: Routes = [
  { path: '', component: LoginPageComponent },
  { path: 'trainer', component: TrainerPageComponent },
  { path: 'associate', component: AssociatePageComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
