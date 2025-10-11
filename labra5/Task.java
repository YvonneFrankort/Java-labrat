import java.util.List;
import java.util.ArrayList;

public class Task{
    String title;
    Difficulty difficulty;

    enum Difficulty{
        EASY,
        MEDIUM,
        HARD
    }

    public Task(String title, Difficulty difficulty){
        this.title = title;
        this.difficulty = difficulty;
    }
}

class TaskDifficulty{

    public static List<Task> filterBy(List<Task> tasks, Task.Difficulty d) {
        List<Task> result = new ArrayList<>();
        for (Task t : tasks) {
            if (t.difficulty == d) {
                result.add(t);
            }
        }
        return result;
    }
}