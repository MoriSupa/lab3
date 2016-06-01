package littlemylyn.model;

import java.util.ArrayList;

import littlemylyn.entities.Task;
import org.json.JSONObject;

public class TaskManager implements ITaskManager {
	ArrayList<Task> model = new ArrayList<Task>();
	
	@Override
	public boolean addTask(Task newTask) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<model.size()){
			if(newTask.getTaskId()==model.get(i).getTaskId())
				return false;
		}
		model.add(newTask);
		return true;
	}

	@Override
	public boolean removeTask(Task parTask) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<model.size()){
			if(parTask.getTaskId()==model.get(i).getTaskId()){
				model.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateTask(Task parTask) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i<model.size()){
			if(parTask.getTaskId()==model.get(i).getTaskId()){
				model.remove(i);
				addTask(parTask);
				return true;
			}
		}
		return false;
	}

	@Override
	public ArrayList<Task> getTasks() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public boolean dump() {
		// TODO Auto-generated method stub
		
		JSONObject json = new JSONObject();
		return false;
	}

}
