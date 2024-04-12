import React from 'react';
import { Route, Routes as Switch, Link } from 'react-router-dom';
import Home from './Home.js';
import About from './About.js';
import Users from './Users.js';
import Contact from './Contact.js';

function Nav() {
  return (
    <div>
    <nav className="navbar">
          <div className="navbar-left">
            <Link to="/" className="logo">JBDesigns</Link>
          </div>
          <div className="navbar-right">
            <Link to="/">Home</Link>
            <Link to="/about">About</Link>
            <Link to="/users">Users</Link>
            <Link to="/contact">Contact</Link>
          </div>
        </nav>
        <Switch>
        <Route path="/" exact element={<Home/>} />
        <Route path="/about" element={<About/>} />
        <Route path="/users" element={<Users/>} />
        <Route path="/contact" element={<Contact/>} />
        </Switch>
        </div>
  );
}

export default Nav;