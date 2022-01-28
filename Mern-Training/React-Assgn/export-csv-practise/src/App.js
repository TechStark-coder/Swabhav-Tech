import React from 'react';
import { CSVLink } from "react-csv";

const headers = [
  { label: "First Name", key: "firstName" },
  { label: "Last Name", key: "lastName" },
  { label: "Email", key: "email" },
  { label: "Age", key: "age" }
];

const data = [
  { firstName: "ankit", lastName: "kushwah", email: "hello@gmail.com", age: "20" },
  { firstName: "nonganba", lastName: "singha", email: "hello1@gmail.com", age: "20" },
  { firstName: "faisal", lastName: "akhtar", email: "hello2@gmail.com", age: "20" },
  { firstName: "asif", lastName: "peerzade", email: "hello3@gmail.com", age: "20" }
];

const csvreport = {
  data: data,
  headers: headers,
  filename: 'Apna backend ka data.csv'
};

function App() {
  return (
    <div classname="App">
      <CSVLink  {...csvreport}> yaha se krle bhai.. download.. </CSVLink>
    </div>
  );}
