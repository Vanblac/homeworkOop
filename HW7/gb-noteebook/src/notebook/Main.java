import controller.UserController;
import file.impl.FileOperation;
import log.impl.ConsoleLogger;
import log.Logger;
import model.User;
import repository.GBRepository;
import repository.impl.UserRepository;
import view.UserView;
import static util.DBConnector.DB_PATH;
import static util.DBConnector.createDB;


public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        Logger logger = new ConsoleLogger();
        UserController controller = new UserController(repository, logger);
        UserView view = new UserView(controller);
        view.run();
    }
}