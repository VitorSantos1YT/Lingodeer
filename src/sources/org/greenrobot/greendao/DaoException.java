package org.greenrobot.greendao;

import android.database.SQLException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class DaoException extends SQLException {
    private static final long serialVersionUID = -5877937327907457779L;

    public DaoException() {
    }

    public DaoException(String str, Exception exc) {
        super(str);
        try {
            initCause(exc);
        } catch (Throwable unused) {
        }
    }
}
