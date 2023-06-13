import axios from "axios";

//request sever
export default axios.create({
    baseURL:"http://localhost:8080",
    // headers:{'Content-Type': 'application/json'},
})