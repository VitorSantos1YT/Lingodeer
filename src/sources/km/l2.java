package km;

import com.lingo.lingoskill.object.YouYin;
import com.lingo.lingoskill.object.YouYinDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 extends im.a {
    @Override // im.a
    public final List a() {
        k10.g gVarQueryBuilder = this.f34464c.queryBuilder();
        gVarQueryBuilder.e(" ASC", YouYinDao.Properties.Id);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }

    @Override // im.a
    public final List b(List yinTus) {
        kotlin.jvm.internal.m.f(yinTus, "yinTus");
        int size = yinTus.size() / 3;
        int i11 = 0;
        while (i11 < size) {
            YouYin youYin = new YouYin();
            youYin.setId(-1L);
            int i12 = i11 + 1;
            yinTus.add((i12 * 3) + i11, youYin);
            i11 = i12;
        }
        return yinTus;
    }
}
