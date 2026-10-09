package h4;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f31671b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f31672a = new HashMap();

    static {
        HashMap map = new HashMap();
        f31671b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            map.put("KeyPosition", j.class.getConstructor(null));
            map.put("KeyCycle", g.class.getConstructor(null));
            map.put("KeyTimeCycle", l.class.getConstructor(null));
            map.put("KeyTrigger", n.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void a(q qVar) {
        HashMap map = this.f31672a;
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(qVar.f31749c));
        if (arrayList != null) {
            qVar.f31768w.addAll(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) map.get(-1);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                c cVar = (c) obj;
                String str = ((j4.e) qVar.f31748b.getLayoutParams()).Y;
                String str2 = cVar.f31563c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    qVar.a(cVar);
                }
            }
        }
    }

    public final void b(c cVar) {
        HashMap map = this.f31672a;
        if (!map.containsKey(Integer.valueOf(cVar.f31562b))) {
            map.put(Integer.valueOf(cVar.f31562b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(cVar.f31562b));
        if (arrayList != null) {
            arrayList.add(cVar);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public h(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        HashMap map2;
        c lVar;
        try {
            int eventType = xmlResourceParser.getEventType();
            c cVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && scqhIrGXy.IFdNFGEYeEvNUZ.equals(xmlResourceParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlResourceParser.getName();
                    if (f31671b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (name.equals("KeyTimeCycle")) {
                                    lVar = new l();
                                    lVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(lVar);
                                    cVar = lVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case -298435811:
                                if (name.equals("KeyAttribute")) {
                                    lVar = new e();
                                    lVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(lVar);
                                    cVar = lVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 540053991:
                                if (name.equals("KeyCycle")) {
                                    lVar = new g();
                                    lVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(lVar);
                                    cVar = lVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1153397896:
                                if (name.equals("KeyPosition")) {
                                    lVar = new j();
                                    lVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(lVar);
                                    cVar = lVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            case 1308496505:
                                if (name.equals("KeyTrigger")) {
                                    lVar = new n();
                                    lVar.e(context, Xml.asAttributeSet(xmlResourceParser));
                                    b(lVar);
                                    cVar = lVar;
                                } else {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        return;
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (cVar != null && (map2 = cVar.f31564d) != null) {
                            j4.b.d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && cVar != null && (map = cVar.f31564d) != null) {
                        j4.b.d(context, xmlResourceParser, map);
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }
}
