package au;

import com.lingodeer.data.model.UserInfo;
import com.lingodeer.database.model.BookmarkEntity;
import com.lingodeer.database.model.BookmarkFolderEntity;
import com.lingodeer.database.model.KnowledgeNoteEntity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2995c;

    public /* synthetic */ g(String str, String str2, int i11) {
        this.f2993a = i11;
        this.f2994b = str;
        this.f2995c = str2;
    }

    @Override // fz.c
    public final Object invoke(Object obj) throws Exception {
        switch (this.f2993a) {
            case 0:
                String str = this.f2994b;
                String str2 = this.f2995c;
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ja.c cVarB1 = _connection.B1("SELECT * FROM bookmark WHERE lan = ? AND content_type = ?");
                try {
                    cVarB1.b0(1, str);
                    cVarB1.b0(2, str2);
                    int iM = com.bumptech.glide.g.m(cVarB1, "id");
                    int iM2 = com.bumptech.glide.g.m(cVarB1, "lan");
                    int iM3 = com.bumptech.glide.g.m(cVarB1, "is_fav");
                    int iM4 = com.bumptech.glide.g.m(cVarB1, "content_type");
                    int iM5 = com.bumptech.glide.g.m(cVarB1, "time");
                    int iM6 = com.bumptech.glide.g.m(cVarB1, "folder_id");
                    ArrayList arrayList = new ArrayList();
                    while (cVarB1.r1()) {
                        arrayList.add(new BookmarkEntity(cVarB1.B0(iM), cVarB1.B0(iM2), (int) cVarB1.getLong(iM3), cVarB1.B0(iM4), cVarB1.getLong(iM5), cVarB1.isNull(iM6) ? null : cVarB1.B0(iM6)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarB1.close();
                }
            case 1:
                String str3 = this.f2994b;
                String str4 = this.f2995c;
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ja.c cVarB2 = _connection2.B1("\n        SELECT * FROM bookmark_folder\n        WHERE lan = ? AND content_type = ? AND is_deleted = 0\n        ORDER BY time DESC\n        ");
                try {
                    cVarB2.b0(1, str3);
                    cVarB2.b0(2, str4);
                    int iM7 = com.bumptech.glide.g.m(cVarB2, "id");
                    int iM8 = com.bumptech.glide.g.m(cVarB2, "lan");
                    int iM9 = com.bumptech.glide.g.m(cVarB2, "content_type");
                    int iM10 = com.bumptech.glide.g.m(cVarB2, "name");
                    int iM11 = com.bumptech.glide.g.m(cVarB2, "server_id");
                    int iM12 = com.bumptech.glide.g.m(cVarB2, "is_deleted");
                    int iM13 = com.bumptech.glide.g.m(cVarB2, "time");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarB2.r1()) {
                        int i11 = iM9;
                        arrayList2.add(new BookmarkFolderEntity(cVarB2.B0(iM7), cVarB2.B0(iM8), cVarB2.B0(iM9), cVarB2.B0(iM10), (int) cVarB2.getLong(iM11), ((int) cVarB2.getLong(iM12)) != 0, cVarB2.getLong(iM13)));
                        iM9 = i11;
                    }
                    cVarB2.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    cVarB2.close();
                    throw th2;
                }
            case 2:
                String str5 = this.f2994b;
                String str6 = this.f2995c;
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ja.c cVarB3 = _connection3.B1("SELECT * FROM knowledge_note WHERE lan = ? AND value = ? AND is_deleted = 0 ORDER BY updated_at DESC");
                boolean z11 = true;
                try {
                    cVarB3.b0(1, str5);
                    cVarB3.b0(2, str6);
                    int iM14 = com.bumptech.glide.g.m(cVarB3, "id");
                    int iM15 = com.bumptech.glide.g.m(cVarB3, "lan");
                    int iM16 = com.bumptech.glide.g.m(cVarB3, "value");
                    int iM17 = com.bumptech.glide.g.m(cVarB3, "elem_id");
                    int iM18 = com.bumptech.glide.g.m(cVarB3, "note");
                    int iM19 = com.bumptech.glide.g.m(cVarB3, "updated_at");
                    int iM20 = com.bumptech.glide.g.m(cVarB3, "is_deleted");
                    int iM21 = com.bumptech.glide.g.m(cVarB3, "pending_update");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarB3.r1()) {
                        int i12 = iM16;
                        arrayList3.add(new KnowledgeNoteEntity(cVarB3.B0(iM14), cVarB3.B0(iM15), cVarB3.B0(iM16), cVarB3.getLong(iM17), cVarB3.B0(iM18), cVarB3.getLong(iM19), ((int) cVarB3.getLong(iM20)) != 0 ? z11 : false, ((int) cVarB3.getLong(iM21)) != 0));
                        iM16 = i12;
                        z11 = true;
                    }
                    cVarB3.close();
                    return arrayList3;
                } catch (Throwable th3) {
                    cVarB3.close();
                    throw th3;
                }
            case 3:
                return UserInfo.copy$default((UserInfo) obj, null, 0, 0, 0, 0, 0, 0L, 0, 0L, this.f2994b, null, null, null, null, this.f2995c, null, null, 0, 0, 0, 0, 0, 0, null, null, 33537535, null);
            default:
                UserInfo currentUserInfo = (UserInfo) obj;
                kotlin.jvm.internal.m.f(currentUserInfo, "currentUserInfo");
                return UserInfo.copy$default(currentUserInfo, null, 0, 0, 0, 0, 0, 0L, 0, 0L, this.f2994b, null, null, null, null, this.f2995c, null, null, 0, 0, 0, 0, 0, 0, null, null, 33537535, null);
        }
    }
}
