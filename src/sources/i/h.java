package i;

import dl.ExOZ.xItStCyvVEZ;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f33876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f33877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j.a f33878d;

    public /* synthetic */ h(i iVar, String str, j.a aVar, int i11) {
        this.f33875a = i11;
        this.f33876b = iVar;
        this.f33877c = str;
        this.f33878d = aVar;
    }

    @Override // i.c
    public final void b() {
        switch (this.f33875a) {
            case 0:
                this.f33876b.f(this.f33877c);
                break;
            default:
                this.f33876b.f(this.f33877c);
                break;
        }
    }

    @Override // i.c
    public final void a(Object obj) {
        switch (this.f33875a) {
            case 0:
                i iVar = this.f33876b;
                ArrayList arrayList = iVar.f33882d;
                LinkedHashMap linkedHashMap = iVar.f33880b;
                String str = this.f33877c;
                Object obj2 = linkedHashMap.get(str);
                j.a aVar = this.f33878d;
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    iVar.b(iIntValue, aVar, obj);
                    return;
                } catch (Exception e8) {
                    arrayList.remove(str);
                    throw e8;
                }
            default:
                i iVar2 = this.f33876b;
                ArrayList arrayList2 = iVar2.f33882d;
                LinkedHashMap linkedHashMap2 = iVar2.f33880b;
                String str2 = this.f33877c;
                Object obj3 = linkedHashMap2.get(str2);
                j.a aVar2 = this.f33878d;
                if (obj3 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + aVar2 + " and input " + obj + xItStCyvVEZ.nyPJyeAVrhd).toString());
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    iVar2.b(iIntValue2, aVar2, obj);
                    return;
                } catch (Exception e10) {
                    arrayList2.remove(str2);
                    throw e10;
                }
        }
    }
}
