package by.tms.lesson25.storage;

import by.tms.lesson25.model.Operation;

import java.util.List;

public interface OperationStorage {
    void save(Operation operation);
    List<Operation> findAll();
}
