package km;

import com.lingo.lingoskill.object.ZhuoYin;
import com.lingo.lingoskill.object.ZhuoYinDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 extends im.a {
    @Override // im.a
    public final List a() {
        k10.g gVarQueryBuilder = this.f34463b.queryBuilder();
        gVarQueryBuilder.e(" ASC", ZhuoYinDao.Properties.Id);
        List listD = gVarQueryBuilder.d();
        kotlin.jvm.internal.m.e(listD, "list(...)");
        return listD;
    }

    @Override // im.a
    public final List b(List yinTus) {
        kotlin.jvm.internal.m.f(yinTus, "yinTus");
        int size = yinTus.size() / 5;
        int i11 = 0;
        while (i11 < size) {
            ZhuoYin zhuoYin = new ZhuoYin();
            zhuoYin.setId(-1L);
            int i12 = i11 + 1;
            yinTus.add((i12 * 5) + i11, zhuoYin);
            i11 = i12;
        }
        return yinTus;
    }
}
