import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AssociateAuthGuard } from './associate-auth.guard';
import { AssociateComponent } from './associate/associate.component';
import { LoginComponent } from './login/login.component';
import { TrainerAuthGuard } from './trainer-auth.guard';
import { TrainerComponent } from './trainer/trainer.component';

const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'associate', component: AssociateComponent, canActivate: [ AssociateAuthGuard ] },
  { path: 'trainer', component: TrainerComponent, canActivate: [ TrainerAuthGuard ] }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
