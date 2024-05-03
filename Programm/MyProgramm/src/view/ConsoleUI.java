package view;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;
    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }
    @Override
    public void start() {
        hello();
        while(work) {
            printMenu();
            choice();
        }
    }
    private void hello () {
        System.out.println("Добро пожаловать!");
    }
    private void choice () {
        String value = scanner.nextLine();
        if (checkMenu(value)) {
            int num = Integer.parseInt(value);
            menu.execute(num);
        }
    }
    public void finish() {
        System.out.println("Работа приложения завершена.");
        scanner.close();
        work = false;
    }
    private void printMenu() {
        System.out.println("Выберите пункт меню.");
        System.out.println(menu.menu());
    }
    public void setWritable(Writable writable) {
        presenter.setWritable(writable);
    }
    public void load() {
        try {
            presenter.load();
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void viewAll() {
        presenter.allTree();
    }

    public void addAnimal() {
        System.out.println("Выберите пункт: ");
        String lastname = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
