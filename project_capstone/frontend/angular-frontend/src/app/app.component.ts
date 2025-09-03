import { Component } from '@angular/core';
import { AuthService } from './services/auth.service';

@Component({
  selector: 'app-root',
  template: `
<nav class="navbar navbar-expand-lg navbar-dark gradient-navbar shadow-sm sticky-top">
  <div class="container-fluid">
    <!-- Brand -->
    <a class="navbar-brand fw-bold fs-4" routerLink="/">Ecommerce Application</a>

    <!-- Toggle button for mobile -->
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent">
      <span class="navbar-toggler-icon"></span>
    </button>

    <!-- Navbar Links -->
    <div class="collapse navbar-collapse" id="navbarContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a routerLink="/" class="nav-link" routerLinkActive="active">Catalog</a>
        </li>
        <li class="nav-item" *ngIf="auth.isLoggedIn()">
          <a routerLink="/cart" class="nav-link position-relative">
            <i class="bi bi-cart-fill me-1"></i> Cart
            <span class="badge bg-danger rounded-pill position-absolute top-0 start-100 translate-middle">
              {{ auth.cartCount || 0 }}
            </span>
          </a>
        </li>
        <li class="nav-item" *ngIf="auth.isLoggedIn()">
          <a routerLink="/orders" class="nav-link">My Orders</a>
        </li>
        <li class="nav-item" *ngIf="auth.role==='ADMIN'">
          <a routerLink="/admin/products" class="nav-link">Products</a>
        </li>
      </ul>

      <!-- Right Side Auth Buttons -->
      <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
        <li class="nav-item" *ngIf="!auth.isLoggedIn()">
          <a routerLink="/login" class="btn btn-light text-primary px-4 rounded-pill shadow-sm">Login</a>
        </li>
        <li class="nav-item" *ngIf="auth.isLoggedIn()">
          <a href="#" (click)="auth.logout()" class="btn btn-outline-light px-4 rounded-pill shadow-sm ms-2">Logout</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<!-- Main content -->
<div class="container my-4">
  <router-outlet></router-outlet>
</div>
  `,
  styles: [`
/* Gradient navbar */
.gradient-navbar {
  background: linear-gradient(90deg, #ff4d4d, #b30000); /* light red → dark red */
  color: #f9fafb;
  border-bottom: 1px solid rgba(255, 255, 255, 0.15);
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0.6rem 1.2rem;
  border-radius: 12px; /* rounded navbar edges */
}

.gradient-navbar .navbar-brand {
  flex: 1;
  color: #fff;
  font-size: 1.3rem;
  font-weight: 600;
  letter-spacing: 1px;
  text-shadow: 1px 1px 3px rgba(0,0,0,0.4);
}

.gradient-navbar .nav-links {
  flex: 2;
  display: flex;
  justify-content: center;
  gap: 1.5rem;
}

.gradient-navbar .nav-link {
  color: #f9fafb;
  font-weight: 500;
  transition: all 0.3s ease;
}

.gradient-navbar .nav-link:hover {
  color: #facc15;
  text-decoration: underline;
}

.gradient-navbar .btn-area {
  flex: 1;
  display: flex;
  justify-content: flex-end;
  gap: 0.8rem;
}

.gradient-navbar .btn {
  font-weight: 500;
  background: rgba(255,255,255,0.15);
  color: #fff;
  transition: all 0.3s ease;
  border: none;
  padding: 0.4rem 1rem;
  border-radius: 12px; /* rounded buttons */
}

.gradient-navbar .btn:hover {
  background: rgba(255,255,255,0.25);
  transform: translateY(-2px);
  box-shadow: 0 4px 14px rgba(0,0,0,0.3);
}

.badge {
  font-size: 0.75rem;
  font-weight: 600;
  background: #facc15;
  color: #1f2937;
  border-radius: 12px; /* rounded badges */
}

/* Responsive adjustments */
@media (max-width: 576px) {
  .gradient-navbar {
    flex-direction: column;
    align-items: center;
  }
  .nav-links {
    margin: 0.6rem 0;
    flex-wrap: wrap;
    justify-content: center;
  }
  .btn-area {
    justify-content: center;
  }
}
  `]
})
export class AppComponent {
  constructor(public auth: AuthService) {}
}
