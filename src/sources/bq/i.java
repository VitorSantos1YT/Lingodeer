package bq;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharPart;
import com.lingo.lingoskill.object.HwCharPartDao;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.object.HwTCharPart;
import com.lingo.lingoskill.object.HwTCharPartDao;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static qy.l a(HwCharacter hwCharacter) {
        kotlin.jvm.internal.m.f(hwCharacter, "hwCharacter");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        if (ry.l.D(new Integer[]{1, 12}, Integer.valueOf(cf.x.n().keyLanguage))) {
            if (dm.c.f23488f == null) {
                synchronized (dm.c.class) {
                    if (dm.c.f23488f == null) {
                        LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication2);
                        dm.c.f23488f = new dm.c(lingoSkillApplication2);
                    }
                }
            }
            dm.c cVar = dm.c.f23488f;
            kotlin.jvm.internal.m.c(cVar);
            Object value = ((qy.q) cVar.f23493e).getValue();
            kotlin.jvm.internal.m.e(value, "getValue(...)");
            k10.g gVarQueryBuilder = ((HwCharPartDao) value).queryBuilder();
            gVarQueryBuilder.f(HwCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            List listD = gVarQueryBuilder.d();
            kotlin.jvm.internal.m.e(listD, "list(...)");
            for (HwCharPart hwCharPart : ry.m.S0(listD, new h(0))) {
                arrayList.add(hwCharPart.getPartDirection());
                arrayList2.add(hwCharPart.getPartPath());
            }
        } else if (cf.x.n().isSChinese || (kotlin.jvm.internal.m.a(hwCharacter.getTCharacter(), hwCharacter.getCharacter()) && !cf.x.n().isSChinese)) {
            if (oi.c.f44924t == null) {
                synchronized (oi.c.class) {
                    if (oi.c.f44924t == null) {
                        LingoSkillApplication lingoSkillApplication3 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication3);
                        oi.c.f44924t = new oi.c(lingoSkillApplication3);
                    }
                }
            }
            oi.c cVar2 = oi.c.f44924t;
            kotlin.jvm.internal.m.c(cVar2);
            Object value2 = ((qy.q) cVar2.f44927c).getValue();
            kotlin.jvm.internal.m.e(value2, "getValue(...)");
            k10.g gVarQueryBuilder2 = ((HwCharPartDao) value2).queryBuilder();
            gVarQueryBuilder2.f(HwCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            List listD2 = gVarQueryBuilder2.d();
            kotlin.jvm.internal.m.e(listD2, "list(...)");
            for (HwCharPart hwCharPart2 : ry.m.S0(listD2, new h(1))) {
                arrayList.add(hwCharPart2.getPartDirection());
                arrayList2.add(hwCharPart2.getPartPath());
            }
        } else {
            if (oi.c.f44924t == null) {
                synchronized (oi.c.class) {
                    if (oi.c.f44924t == null) {
                        LingoSkillApplication lingoSkillApplication4 = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication4);
                        oi.c.f44924t = new oi.c(lingoSkillApplication4);
                    }
                }
            }
            oi.c cVar3 = oi.c.f44924t;
            kotlin.jvm.internal.m.c(cVar3);
            Object value3 = ((qy.q) cVar3.f44928d).getValue();
            kotlin.jvm.internal.m.e(value3, "getValue(...)");
            k10.g gVarQueryBuilder3 = ((HwTCharPartDao) value3).queryBuilder();
            gVarQueryBuilder3.f(HwTCharPartDao.Properties.CharId.b(Long.valueOf(hwCharacter.getCharId())), new k10.h[0]);
            List listD3 = gVarQueryBuilder3.d();
            kotlin.jvm.internal.m.e(listD3, "list(...)");
            for (HwTCharPart hwTCharPart : ry.m.S0(listD3, new h(2))) {
                arrayList.add(hwTCharPart.getPartDirection());
                arrayList2.add(hwTCharPart.getPartPath());
            }
        }
        return new qy.l(arrayList, arrayList2);
    }
}
