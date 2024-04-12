import React, { useState, useEffect } from 'react';
import axios from 'axios';
import './MyTable.css'; 

const DataFetcher = () => {
    const [data, setData] = useState([]);
    const [searchTitle, setSearchTitle] = useState('');
    const [filteredData, setFilteredData] = useState([]);
   
    useEffect(() => {
      const fetchData = async () => {
        try {
          //const response = await axios.get('http://localhost:5000/users');
          const response = await fetch('http://localhost:5000/users');
          const jsonData = await response.json();
          setFilteredData(jsonData.slice(0, 10));
          setData(jsonData.slice(0, 10));
        } catch (error) {
          console.error('Error fetching data:', error);
        }
      };
   
      fetchData();
    }, []);

    const handleSearch = (event) => {
        const searchTitle = event.target.value.toLowerCase();
        setSearchTitle(searchTitle);
        const filtered = data.filter(item =>
          item.userName.toLowerCase().includes(searchTitle)
        );
        setFilteredData(filtered);
      };
   
    return (
        <div>
        <input 
        type="text" 
        placeholder="Search..." 
        value={searchTitle} 
        onChange={handleSearch} 
      />
        <div className="table-container">
        <table className="styled-table">
        <thead>
          <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Name</th>
            <th>Address</th>
          </tr>
        </thead>
        <tbody>
          {filteredData.map(item => (
            <tr key={item.userId}>
              <td>{item.userId}</td>
              <td>{item.title}</td>
              <td>{item.userName}</td>
              <td>{item.userAddress}</td>
            </tr>
          ))}
        </tbody>
      </table>
      </div>
      </div>
    );
  };
   
  export default DataFetcher;