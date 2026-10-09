package au;

import com.lingodeer.database.model.BookmarkFolderEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3041c;

    public /* synthetic */ l(int i11, int i12, String str) {
        this.f3039a = i12;
        this.f3040b = i11;
        this.f3041c = str;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        BookmarkFolderEntity bookmarkFolderEntity;
        switch (this.f3039a) {
            case 0:
                String str = this.f3041c;
                int i11 = this.f3040b;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("SELECT * FROM bookmark_folder WHERE lan = ? AND server_id = ? LIMIT 1");
                try {
                    cVarB1.b0(1, str);
                    cVarB1.g(2, i11);
                    int iM = com.bumptech.glide.g.m(cVarB1, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "content_type");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "name");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "server_id");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "is_deleted");
                    int iM7 = com.bumptech.glide.g.m(cVarB1, "time");
                    if (cVarB1.r1()) {
                        bookmarkFolderEntity = new BookmarkFolderEntity(cVarB1.B0(iM), cVarB1.B0(iM2), cVarB1.B0(iM3), cVarB1.B0(iM4), (int) cVarB1.getLong(iM5), ((int) cVarB1.getLong(iM6)) != 0, cVarB1.getLong(iM7));
                        break;
                    } else {
                        bookmarkFolderEntity = null;
                    }
                    return bookmarkFolderEntity;
                } finally {
                    cVarB1.close();
                }
            case 1:
                int i12 = this.f3040b;
                String str2 = this.f3041c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("\n        UPDATE daily_learn_history\n        SET amount = amount + ?,\n            pending_amount = pending_amount - ?\n        WHERE id = ?\n        ");
                long j11 = i12;
                try {
                    cVarB2.g(1, j11);
                    cVarB2.g(2, j11);
                    cVarB2.b0(3, str2);
                    cVarB2.r1();
                } finally {
                    cVarB2.close();
                }
                break;
            case 2:
                int i13 = this.f3040b;
                String str3 = this.f3041c;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("\n        UPDATE daily_learn_history\n        SET pending_amount = pending_amount + ?\n        WHERE id = ?\n        ");
                try {
                    cVarB3.g(1, i13);
                    cVarB3.b0(2, str3);
                    cVarB3.r1();
                } finally {
                    cVarB3.close();
                }
                break;
            case 3:
                int i14 = this.f3040b;
                String str4 = this.f3041c;
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ja.c cVarB4 = _connection4.B1("\n        UPDATE daily_learn_time_history\n        SET seconds = seconds + ?,\n            pending_seconds = pending_seconds - ?\n        WHERE id = ?\n        ");
                long j12 = i14;
                try {
                    cVarB4.g(1, j12);
                    cVarB4.g(2, j12);
                    cVarB4.b0(3, str4);
                    cVarB4.r1();
                } finally {
                    cVarB4.close();
                }
                break;
            default:
                int i15 = this.f3040b;
                String str5 = this.f3041c;
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ja.c cVarB5 = _connection5.B1("\n        UPDATE daily_learn_time_history\n        SET pending_seconds = pending_seconds + ?\n        WHERE id = ?\n        ");
                try {
                    cVarB5.g(1, i15);
                    cVarB5.b0(2, str5);
                    cVarB5.r1();
                } finally {
                    cVarB5.close();
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ l(String str, int i11) {
        this.f3039a = 0;
        this.f3041c = str;
        this.f3040b = i11;
    }
}
