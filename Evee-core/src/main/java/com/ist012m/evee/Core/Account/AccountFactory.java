package com.ist012m.evee.Core.Account;

import java.io.*;
import java.util.*;

import com.ist012m.evee.Core.Factories.EntityFactory;
import com.ist012m.evee.Pojo.Account;

public class AccountFactory implements EntityFactory<Account, Map<String, String>> {
    @Override
    public Account create(Map<String, String> response) {
        return new Account();
    }

    @Override
    public void delete(final Account entity) {
    }
}
