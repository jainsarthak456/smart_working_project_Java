import React,{useEffect,useState} from 'react';
import axios from 'axios';
export default function TaskList(){
 const [tasks,setTasks]=useState([]);
 const [title,setTitle]=useState('');
 const load=()=>axios.get('http://localhost:8080/api/tasks').then(r=>setTasks(r.data));
 useEffect(load,[]);
 const add=()=>axios.post('http://localhost:8080/api/tasks',{title}).then(load);
 return(<div>
  <input value={title} onChange={e=>setTitle(e.target.value)} placeholder="New Task"/>
  <button onClick={add}>Add</button>
  <ul>{tasks.map((t:any)=><li key={t.id}>{t.title}</li>)}</ul>
 </div>);
}