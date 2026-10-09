package bh;

import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ConvertUtilsKt;
import com.lingo.lingoskill.object.LDCharacter;
import com.lingo.lingoskill.object.SentenceDao;
import com.lingo.lingoskill.object.WordDao;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.characterstroke.CharacterStroke;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s1 implements rs.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WordDao f4360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentenceDao f4361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.n0 f4362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vt.d0 f4363d;

    public s1(WordDao wordDao, SentenceDao sentenceDao, vt.n0 n0Var, vt.d0 d0Var) {
        this.f4360a = wordDao;
        this.f4361b = sentenceDao;
        this.f4362c = n0Var;
        this.f4363d = d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee A[LOOP:0: B:44:0x00e8->B:46:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131 A[Catch: CancellationException -> 0x014a, Exception -> 0x014c, TryCatch #2 {CancellationException -> 0x014a, Exception -> 0x014c, blocks: (B:51:0x012a, B:53:0x0131, B:55:0x0140), top: B:65:0x012a }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013f  */
    /* JADX WARN: Code duplicated, block: B:69:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(s1 s1Var, Set set, xy.c cVar) {
        c1 c1Var;
        List<CharacterStroke> list;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        v vVar;
        qy.l lVar;
        CharacterStroke characterStroke;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i11 = c1Var.f4180e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1Var.f4180e = i11 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(s1Var, cVar);
            }
        } else {
            c1Var = new c1(s1Var, cVar);
        }
        Object objT = c1Var.f4178c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = c1Var.f4180e;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objT);
            d1 d1Var = new d1(s1Var, dVar, 0);
            c1Var.f4180e = 1;
            objT = vc.a.t(set, d1Var, c1Var);
            if (objT != aVar) {
            }
            return aVar;
        }
        if (i12 == 1) {
            com.bumptech.glide.e.F(objT);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedHashMap = c1Var.f4177b;
            list = c1Var.f4176a;
            com.bumptech.glide.e.F(objT);
        }
        Iterable iterable = (Iterable) objT;
        int iW = ry.x.W(ry.n.W(iterable, 10));
        linkedHashMap2 = new LinkedHashMap(iW >= 16 ? iW : 16);
        for (Object obj : iterable) {
            linkedHashMap2.put(new Long(((CharacterStroke) obj).getCharId()), obj);
        }
        arrayList = new ArrayList();
        for (CharacterStroke characterStroke2 : list) {
            vVar = (v) linkedHashMap.get(new Long(characterStroke2.getCharId()));
            try {
                Long l9 = new Long(characterStroke2.getCharId());
                if (vVar != null) {
                    characterStroke = (CharacterStroke) linkedHashMap2.get(new Long(vVar.f4399a));
                } else {
                    characterStroke = null;
                }
                lVar = new qy.l(l9, ue.f.C(characterStroke2, vVar, characterStroke));
            } catch (CancellationException e8) {
                throw e8;
            } catch (Exception unused) {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return ry.x.g0(arrayList);
        list = (List) objT;
        int iW2 = ry.x.W(ry.n.W(list, 10));
        if (iW2 < 16) {
            iW2 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iW2);
        for (CharacterStroke characterStroke3 : list) {
            linkedHashMap3.put(new Long(characterStroke3.getCharId()), ue.f.D(characterStroke3, ((fr.o0) s1Var.f4362c).s()));
        }
        Collection<v> collectionValues = linkedHashMap3.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v vVar2 : collectionValues) {
            Long l11 = vVar2 != null ? new Long(vVar2.f4399a) : null;
            if (l11 != null) {
                linkedHashSet.add(l11);
            }
        }
        d1 d1Var2 = new d1(s1Var, dVar, 1);
        c1Var.f4176a = list;
        c1Var.f4177b = linkedHashMap3;
        c1Var.f4180e = 2;
        objT = vc.a.t(linkedHashSet, d1Var2, c1Var);
        if (objT != aVar) {
            linkedHashMap = linkedHashMap3;
            Iterable iterable2 = (Iterable) objT;
            int iW3 = ry.x.W(ry.n.W(iterable2, 10));
            linkedHashMap2 = new LinkedHashMap(iW3 >= 16 ? iW3 : 16);
            while (r13.hasNext()) {
                linkedHashMap2.put(new Long(((CharacterStroke) obj).getCharId()), obj);
            }
            arrayList = new ArrayList();
            while (r12.hasNext()) {
                vVar = (v) linkedHashMap.get(new Long(characterStroke2.getCharId()));
                Long l12 = new Long(characterStroke2.getCharId());
                if (vVar != null) {
                    characterStroke = (CharacterStroke) linkedHashMap2.get(new Long(vVar.f4399a));
                } else {
                    characterStroke = null;
                }
                lVar = new qy.l(l12, ue.f.C(characterStroke2, vVar, characterStroke));
                if (lVar != null) {
                    arrayList.add(lVar);
                }
            }
            return ry.x.g0(arrayList);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(s1 s1Var, Set set, xy.c cVar) {
        e1 e1Var;
        qy.l lVar;
        if (cVar instanceof e1) {
            e1Var = (e1) cVar;
            int i11 = e1Var.f4201c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e1Var.f4201c = i11 - Integer.MIN_VALUE;
            } else {
                e1Var = new e1(s1Var, cVar);
            }
        } else {
            e1Var = new e1(s1Var, cVar);
        }
        Object objT = e1Var.f4199a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = e1Var.f4201c;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objT);
            if (ij.d.f34419e == null) {
                synchronized (ij.d.class) {
                    if (ij.d.f34419e == null) {
                        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                        kotlin.jvm.internal.m.c(lingoSkillApplication);
                        ij.d.f34419e = new ij.d(lingoSkillApplication);
                    }
                }
            }
            ij.d dVar = ij.d.f34419e;
            kotlin.jvm.internal.m.c(dVar);
            f1 f1Var = new f1(dVar.n(), null);
            e1Var.f4201c = 1;
            objT = vc.a.t(set, f1Var, e1Var);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(objT);
        }
        ArrayList arrayList = new ArrayList();
        for (LDCharacter lDCharacter : (Iterable) objT) {
            try {
                Long l9 = new Long(lDCharacter.getCharId());
                ew.a.v(lDCharacter.getGanRao());
                lVar = new qy.l(l9, ConvertUtilsKt.toCharacterItem(lDCharacter));
            } catch (CancellationException e8) {
                throw e8;
            } catch (Exception unused) {
                lVar = null;
            }
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return ry.x.g0(arrayList);
    }

    public final Object c(Set set, xy.c cVar) {
        if (set.isEmpty()) {
            return ry.s.f50855a;
        }
        yz.f fVar = rz.o0.f50940a;
        return rz.e0.M(yz.e.f58387a, new b1(this, set, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(rs.a aVar, xy.c cVar) {
        g1 g1Var;
        Object objM;
        rs.a aVar2;
        Map map;
        Map map2;
        Object objC;
        Map map3;
        Map map4;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i11 = g1Var.f4220f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g1Var.f4220f = i11 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(this, cVar);
            }
        } else {
            g1Var = new g1(this, cVar);
        }
        Object objM2 = g1Var.f4218d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = g1Var.f4220f;
        Object obj2 = ry.s.f50855a;
        vy.d dVar = null;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM2);
            Set set = aVar.f49394a;
            g1Var.f4215a = aVar;
            g1Var.f4220f = 1;
            if (set.isEmpty()) {
                objM2 = obj2;
            } else {
                yz.f fVar = rz.o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new b1(set, this, dVar, i13), g1Var);
            }
            if (objM2 != obj) {
            }
            return obj;
        }
        if (i12 == 1) {
            aVar = g1Var.f4215a;
            com.bumptech.glide.e.F(objM2);
        } else {
            if (i12 == 2) {
                map = g1Var.f4216b;
                aVar2 = g1Var.f4215a;
                com.bumptech.glide.e.F(objM2);
                map2 = (Map) objM2;
                Set set2 = aVar2.f49396c;
                g1Var.f4215a = null;
                g1Var.f4216b = map;
                g1Var.f4217c = map2;
                g1Var.f4220f = 3;
                objC = c(set2, g1Var);
                if (objC != obj) {
                    map3 = map;
                    map4 = map2;
                    objM2 = objC;
                }
                return obj;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map4 = g1Var.f4217c;
            map3 = g1Var.f4216b;
            com.bumptech.glide.e.F(objM2);
        }
        return new rs.d(map3, map4, (Map) objM2);
        Map map5 = (Map) objM2;
        Set set3 = aVar.f49395b;
        g1Var.f4215a = aVar;
        g1Var.f4216b = map5;
        g1Var.f4220f = 2;
        if (set3.isEmpty()) {
            objM = obj2;
        } else {
            yz.f fVar2 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new j1(set3, this, dVar, 0), g1Var);
        }
        if (objM != obj) {
            Object obj3 = objM;
            aVar2 = aVar;
            map = map5;
            objM2 = obj3;
            map2 = (Map) objM2;
            Set set4 = aVar2.f49396c;
            g1Var.f4215a = null;
            g1Var.f4216b = map;
            g1Var.f4217c = map2;
            g1Var.f4220f = 3;
            objC = c(set4, g1Var);
            if (objC != obj) {
                map3 = map;
                map4 = map2;
                objM2 = objC;
                return new rs.d(map3, map4, (Map) objM2);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(rs.a aVar, xy.c cVar) {
        k1 k1Var;
        rs.a aVar2;
        Map map;
        Map map2;
        Object objC;
        Map map3;
        Map map4;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i11 = k1Var.f4272f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k1Var.f4272f = i11 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object objM = k1Var.f4270d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = k1Var.f4272f;
        Object obj2 = ry.s.f50855a;
        vy.d dVar = null;
        int i13 = 1;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM);
            Set set = aVar.f49394a;
            k1Var.f4267a = aVar;
            k1Var.f4272f = 1;
            if (set.isEmpty()) {
                objM = obj2;
            } else {
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new b1(set, this, dVar, i13), k1Var);
            }
            if (objM != obj) {
            }
            return obj;
        }
        if (i12 == 1) {
            aVar = k1Var.f4267a;
            com.bumptech.glide.e.F(objM);
        } else {
            if (i12 == 2) {
                map = k1Var.f4268b;
                aVar2 = k1Var.f4267a;
                com.bumptech.glide.e.F(objM);
                map2 = (Map) objM;
                Set set2 = aVar2.f49396c;
                k1Var.f4267a = null;
                k1Var.f4268b = map;
                k1Var.f4269c = map2;
                k1Var.f4272f = 3;
                objC = c(set2, k1Var);
                if (objC != obj) {
                    map3 = map;
                    map4 = map2;
                    objM = objC;
                }
                return obj;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map4 = k1Var.f4269c;
            map3 = k1Var.f4268b;
            com.bumptech.glide.e.F(objM);
        }
        return new rs.e(map3, map4, (Map) objM);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) objM).entrySet()) {
            if (((CourseWord) entry.getValue()).getWordType() != 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set set3 = aVar.f49395b;
        k1Var.f4267a = aVar;
        k1Var.f4268b = linkedHashMap;
        k1Var.f4272f = 2;
        if (set3.isEmpty()) {
            objM = obj2;
        } else {
            yz.f fVar2 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new j1(set3, this, dVar, i13), k1Var);
        }
        if (objM != obj) {
            aVar2 = aVar;
            map = linkedHashMap;
            map2 = (Map) objM;
            Set set4 = aVar2.f49396c;
            k1Var.f4267a = null;
            k1Var.f4268b = map;
            k1Var.f4269c = map2;
            k1Var.f4272f = 3;
            objC = c(set4, k1Var);
            if (objC != obj) {
                map3 = map;
                map4 = map2;
                objM = objC;
                return new rs.e(map3, map4, (Map) objM);
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(rs.a aVar, xy.c cVar) {
        o1 o1Var;
        Object objM;
        rs.a aVar2;
        Set set;
        Set set2;
        Object objC;
        Set set3;
        Set set4;
        if (cVar instanceof o1) {
            o1Var = (o1) cVar;
            int i11 = o1Var.f4322f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                o1Var.f4322f = i11 - Integer.MIN_VALUE;
            } else {
                o1Var = new o1(this, cVar);
            }
        } else {
            o1Var = new o1(this, cVar);
        }
        Object objM2 = o1Var.f4320d;
        Object obj = wy.a.COROUTINE_SUSPENDED;
        int i12 = o1Var.f4322f;
        Object obj2 = ry.t.f50856a;
        int i13 = 2;
        vy.d dVar = null;
        if (i12 == 0) {
            com.bumptech.glide.e.F(objM2);
            Set set5 = aVar.f49394a;
            o1Var.f4317a = aVar;
            o1Var.f4322f = 1;
            if (set5.isEmpty()) {
                objM2 = obj2;
            } else {
                yz.f fVar = rz.o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new b1(set5, this, dVar, i13), o1Var);
            }
            if (objM2 != obj) {
            }
            return obj;
        }
        if (i12 == 1) {
            aVar = o1Var.f4317a;
            com.bumptech.glide.e.F(objM2);
        } else {
            if (i12 == 2) {
                set = o1Var.f4318b;
                aVar2 = o1Var.f4317a;
                com.bumptech.glide.e.F(objM2);
                set2 = (Set) objM2;
                Set set6 = aVar2.f49396c;
                o1Var.f4317a = null;
                o1Var.f4318b = set;
                o1Var.f4319c = set2;
                o1Var.f4322f = 3;
                objC = c(set6, o1Var);
                if (objC != obj) {
                    set3 = set;
                    set4 = set2;
                    objM2 = objC;
                }
                return obj;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set4 = o1Var.f4319c;
            set3 = o1Var.f4318b;
            com.bumptech.glide.e.F(objM2);
        }
        return new rs.a(set3, set4, ((Map) objM2).keySet());
        Set set7 = (Set) objM2;
        Set set8 = aVar.f49395b;
        o1Var.f4317a = aVar;
        o1Var.f4318b = set7;
        o1Var.f4322f = 2;
        if (set8.isEmpty()) {
            objM = obj2;
        } else {
            yz.f fVar2 = rz.o0.f50940a;
            objM = rz.e0.M(yz.e.f58387a, new j1(set8, this, dVar, i13), o1Var);
        }
        if (objM != obj) {
            Object obj3 = objM;
            aVar2 = aVar;
            set = set7;
            objM2 = obj3;
            set2 = (Set) objM2;
            Set set9 = aVar2.f49396c;
            o1Var.f4317a = null;
            o1Var.f4318b = set;
            o1Var.f4319c = set2;
            o1Var.f4322f = 3;
            objC = c(set9, o1Var);
            if (objC != obj) {
                set3 = set;
                set4 = set2;
                objM2 = objC;
                return new rs.a(set3, set4, ((Map) objM2).keySet());
            }
        }
        return obj;
    }
}
