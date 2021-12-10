import { TestBed } from '@angular/core/testing';

import { AssociateAuthGuard } from './associate-auth.guard';

describe('AssociateAuthGuard', () => {
  let guard: AssociateAuthGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(AssociateAuthGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
