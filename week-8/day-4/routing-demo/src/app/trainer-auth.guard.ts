import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';

@Injectable({
  providedIn: 'root'
})
export class TrainerAuthGuard implements CanActivate {

  constructor(private authService: AuthService, private router: Router) {
  }

  async canActivate() {
    let user = await this.authService.getLoggedInUser();

    if ( user?.userRole === 'trainer') {
      return true;
    }

    this.router.navigateByUrl('/');
    return false;
  }

}
