package km;

import com.lingo.lingoskill.object.YinTu;
import com.lingo.lingoskill.object.YinTuDao;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c2 extends im.a {
    @Override // im.a
    public final List a() {
        k10.g gVarQueryBuilder = this.f34462a.queryBuilder();
        gVarQueryBuilder.e(" ASC", YinTuDao.Properties.Id);
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
            YinTu yinTu = new YinTu();
            yinTu.setId(-1L);
            int i12 = i11 + 1;
            yinTus.add((i12 * 5) + i11, yinTu);
            i11 = i12;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            YinTu yinTu2 = new YinTu();
            yinTu2.setId(-2L);
            yinTus.add(yinTu2);
        }
        YinTu yinTu3 = new YinTu();
        yinTu3.setId(-1L);
        yinTus.add(yinTu3);
        return yinTus;
    }
}
