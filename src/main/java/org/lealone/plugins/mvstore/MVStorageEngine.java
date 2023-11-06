/*
 * Copyright Lealone Database Group.
 * Licensed under the Server Side Public License, v 1.
 * Initial Developer: zhh
 */
package org.lealone.plugins.mvstore;

import org.lealone.db.DataHandler;
import org.lealone.storage.Storage;
import org.lealone.storage.StorageBuilder;
import org.lealone.storage.StorageEngineBase;
import org.lealone.storage.lob.LobStorage;

public class MVStorageEngine extends StorageEngineBase {

    public static final String NAME = "MVStore";

    public MVStorageEngine() {
        super(NAME);
    }

    @Override
    public StorageBuilder getStorageBuilder() {
        return new MVStorageBuilder();
    }

    @Override
    public LobStorage getLobStorage(DataHandler dataHandler, Storage storage) {
        return null;
    }
}
