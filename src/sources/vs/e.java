package vs;

import au.p;
import com.lingodeer.course.smarttips.data.model.Attr;
import com.lingodeer.course.smarttips.data.model.AudioExampleType;
import com.lingodeer.course.smarttips.data.model.DialogueType;
import com.lingodeer.course.smarttips.data.model.DividerType;
import com.lingodeer.course.smarttips.data.model.ImageExampleType;
import com.lingodeer.course.smarttips.data.model.Style;
import com.lingodeer.course.smarttips.data.model.TableType;
import com.lingodeer.course.smarttips.data.model.TextExampleType;
import com.lingodeer.course.smarttips.data.model.TextType;
import com.lingodeer.data.model.characterstroke.CharacterStrokeKt;
import com.lingodeer.database.CharacterStrokeDatabase;
import com.lingodeer.database.model.CharacterStrokeEntity;
import com.tbruyelle.rxpermissions3.BuildConfig;
import h00.n;
import h00.s;
import h00.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import oz.x;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f54156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f54157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(String str, vy.d dVar, int i11) {
        super(2, dVar);
        this.f54154a = i11;
        this.f54157d = str;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f54154a) {
            case 0:
                e eVar = new e(this.f54157d, dVar, 0);
                eVar.f54156c = obj;
                return eVar;
            default:
                e eVar2 = new e(this.f54157d, dVar, 1);
                eVar2.f54156c = obj;
                return eVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f54154a) {
            case 0:
                return ((e) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
            default:
                return ((e) create((CharacterStrokeDatabase) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list;
        switch (this.f54154a) {
            case 0:
                uz.j jVar = (uz.j) this.f54156c;
                Object obj2 = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f54155b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    String strQ0 = x.q0(this.f54157d, "\n\"", "\"");
                    ArrayList arrayList = new ArrayList();
                    h00.e eVarF = n.f(xt.c.f56291a.d(strQ0));
                    ArrayList arrayList2 = new ArrayList(ry.n.W(eVarF, 10));
                    Iterator it = eVarF.f29919a.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(n.g((h00.m) it.next()));
                    }
                    int size = arrayList2.size();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj3 = arrayList2.get(i13);
                            i13++;
                            z zVar = (z) obj3;
                            String strQ1 = x.q0(String.valueOf(zVar.get("type")), "\"", BuildConfig.VERSION_NAME);
                            switch (strQ1.hashCode()) {
                                case -1322970774:
                                    if (strQ1.equals("example")) {
                                        s sVar = xt.c.f56291a;
                                        String string = zVar.toString();
                                        sVar.getClass();
                                        arrayList.add(new l((TextExampleType) sVar.b(TextExampleType.Companion.serializer(), string), UUID.randomUUID().hashCode()));
                                    }
                                    break;
                                case -724708465:
                                    if (strQ1.equals("imageExample")) {
                                        s sVar2 = xt.c.f56291a;
                                        String string2 = zVar.toString();
                                        sVar2.getClass();
                                        arrayList.add(new i((ImageExampleType) sVar2.b(ImageExampleType.Companion.serializer(), string2), UUID.randomUUID().hashCode()));
                                    }
                                    break;
                                case -233842216:
                                    if (strQ1.equals("dialogue")) {
                                        s sVar3 = xt.c.f56291a;
                                        String string3 = zVar.toString();
                                        sVar3.getClass();
                                        arrayList.add(new g((DialogueType) sVar3.b(DialogueType.Companion.serializer(), string3), UUID.randomUUID().hashCode()));
                                    }
                                    break;
                                case 3556653:
                                    if (strQ1.equals("text")) {
                                        s sVar4 = xt.c.f56291a;
                                        String string4 = zVar.toString();
                                        sVar4.getClass();
                                        TextType textType = (TextType) sVar4.b(TextType.Companion.serializer(), string4);
                                        Attr attr = ((Style) ry.m.q0(textType.getElement().getStyles())).getAttr();
                                        arrayList.add(new k(textType, kotlin.jvm.internal.m.a(attr != null ? attr.getFontSize() : null, "20")));
                                    }
                                    break;
                                case 110115790:
                                    if (strQ1.equals("table")) {
                                        s sVar5 = xt.c.f56291a;
                                        String string5 = zVar.toString();
                                        sVar5.getClass();
                                        arrayList.add(new j((TableType) sVar5.b(TableType.Companion.serializer(), string5)));
                                    }
                                    break;
                                case 1385640116:
                                    if (strQ1.equals("audioExample")) {
                                        s sVar6 = xt.c.f56291a;
                                        String string6 = zVar.toString();
                                        sVar6.getClass();
                                        arrayList.add(new f((AudioExampleType) sVar6.b(AudioExampleType.Companion.serializer(), string6), UUID.randomUUID().hashCode()));
                                    }
                                    break;
                                case 1674318617:
                                    if (strQ1.equals("divider")) {
                                        s sVar7 = xt.c.f56291a;
                                        String string7 = zVar.toString();
                                        sVar7.getClass();
                                        arrayList.add(new h((DividerType) sVar7.b(DividerType.Companion.serializer(), string7)));
                                    }
                                    break;
                            }
                        } else {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            int size2 = arrayList.size();
                            k kVar = null;
                            while (i12 < size2) {
                                Object obj4 = arrayList.get(i12);
                                i12++;
                                m mVar = (m) obj4;
                                if (mVar instanceof k) {
                                    k kVar2 = (k) mVar;
                                    if (kVar2.f54169b) {
                                        linkedHashMap.put(mVar, new ArrayList());
                                        kVar = kVar2;
                                    }
                                }
                                if (kVar != null && (list = (List) linkedHashMap.get(kVar)) != null) {
                                    list.add(mVar);
                                }
                            }
                            arrayList.toString();
                            this.f54156c = null;
                            this.f54155b = 1;
                            if (jVar.emit(linkedHashMap, this) == obj2) {
                                return obj2;
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0.f48488a;
            default:
                CharacterStrokeDatabase characterStrokeDatabase = (CharacterStrokeDatabase) this.f54156c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f54155b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    p pVarZ = characterStrokeDatabase.z();
                    String strJ = md.a.j(this.f54157d);
                    kotlin.jvm.internal.m.e(strJ, "encryptDES(...)");
                    this.f54156c = null;
                    this.f54155b = 1;
                    obj = cf.x.C(this, pVarZ.f3057a, true, false, new au.f(strJ, pVarZ));
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                CharacterStrokeEntity characterStrokeEntity = (CharacterStrokeEntity) ry.m.s0((List) obj);
                if (characterStrokeEntity != null) {
                    return CharacterStrokeKt.asExternalModel(characterStrokeEntity);
                }
                return null;
        }
    }
}
