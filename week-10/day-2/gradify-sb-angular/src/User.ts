export interface User {
  id: number,
  firstName: string,
  lastName: string,
  username: string,
  password: string,
  role: {
    id: number,
    role: string
  }
}
