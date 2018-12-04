import { TestBed } from '@angular/core/testing';

import { UpdateUserService } from './updateUser.service';

describe('UpdateUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: UpdateUserService = TestBed.get(UpdateUserService);
    expect(service).toBeTruthy();
  });
});
