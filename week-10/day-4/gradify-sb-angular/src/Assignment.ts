export interface Assignment {
  id: number,
  assignmentName: string,
  grade: number,
  status: {
    status: string;
  },
  author: {
    id: number,
    firstName: string,
    lastName: string
  },
  resolver: {
    id: number,
    firstName: string,
    lastName: string
  }
}
