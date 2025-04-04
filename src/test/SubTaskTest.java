package test;

import main.Epic;
import main.Subtask;
import main.Status;
import main.TaskManager;

public class SubTaskTest {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        // Создание эпика
        Epic epic1 = taskManager.addEpic(new Epic("Эпик 1", "Описание эпика 1"));

        // Создание подзадач
        Subtask subtask1 = taskManager.addSubtask(new Subtask("Подзадача 1", "Описание подзадачи 1", 1));
        Subtask subtask2 = taskManager.addSubtask(new Subtask("Подзадача 2", "Описание подзадачи 2", 1));
        System.out.println("Созданы подзадачи:");
        System.out.println(subtask1);
        System.out.println(subtask2);
        System.out.println();

        // Обновление статуса подзадачи
        System.out.println("Обновляем статус подзадачи");
        subtask1.setStatus(Status.DONE);
        taskManager.updateSubtask(subtask1);
        System.out.println("Статус первой подзадачи успешно обновлен.");
        System.out.println(subtask1);
        System.out.println();

        // Удаление подзадачи
        System.out.println("Удаляем вторую подзадачу");
        taskManager.deleteSubtaskByID(subtask2.getId());
        System.out.println();
    }
}