package app.rive.runtime.kotlin.fonts;

import cz.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.f;
import mt.b6;
import ns.o;
import nz.h;
import nz.j;
import nz.l;
import nz.t;
import oz.q;
import qx.b;
import qy.c;
import ry.m;
import ry.n;
import ry.r;
import ry.s;
import ry.x;
import vr.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class FontHelper {
    public static final int $stable = 0;
    private static final String TAG = "FontHelper";
    public static final Companion Companion = new Companion(null);
    private static final AtomicReference<Map<String, Fonts.Family>> familiesMapCache = new AtomicReference<>(null);
    private static final AtomicReference<List<Fonts.Family>> familiesListCache = new AtomicReference<>(null);

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        private final void filterFamilies(List<Fonts.Family> list, Set<Fonts.Font> set, Fonts.Weight weight, String str) {
            l<Fonts.Font> lVarG0;
            for (Fonts.Family family : list) {
                if (weight == null) {
                    lVarG0 = new j(m.g0(family.getFonts().values()), new a(5), new b6(18));
                } else {
                    List<Fonts.Font> list2 = family.getFonts().get(weight);
                    lVarG0 = list2 != null ? m.g0(list2) : h.f44323a;
                }
                for (Fonts.Font font : lVarG0) {
                    if (str == null || q.K0(str) || kotlin.jvm.internal.m.a(font.getStyle(), str)) {
                        set.add(font);
                    }
                }
            }
        }

        private final Map<String, Fonts.Family> filterNonExistingFonts(Map<String, Fonts.Family> map) {
            if (map.isEmpty()) {
                return map;
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(m.a1(map.values()));
            int iW = x.W(n.W(listFilterNonExistingFonts, 10));
            if (iW < 16) {
                iW = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iW);
            for (Object obj : listFilterNonExistingFonts) {
                Fonts.Family family = (Fonts.Family) obj;
                String name = family.getName();
                linkedHashMap.put((name == null || name.length() == 0) ? ((Fonts.Font) m.q0(n.X(family.getFonts().values()))).getName() : family.getName(), obj);
            }
            return linkedHashMap;
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((Map<String, Fonts.Family>) map, fontOpts);
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        private final List<Fonts.Font> processMatchingFamilies(l lVar, final String str, Fonts.Weight weight, String str2) {
            List listZ = nz.n.Z(lVar);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listZ) {
                String name = ((Fonts.Family) obj).getName();
                if (name == null || q.K0(name)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            List<Fonts.Family> listS0 = m.S0(arrayList, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t6, T t8) {
                    return b.i(Boolean.valueOf(kotlin.jvm.internal.m.a(((Fonts.Family) t8).getLang(), str)), Boolean.valueOf(kotlin.jvm.internal.m.a(((Fonts.Family) t6).getLang(), str)));
                }
            });
            List<Fonts.Family> listS1 = m.S0(arrayList2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$processMatchingFamilies$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t6, T t8) {
                    return b.i(Boolean.valueOf(kotlin.jvm.internal.m.a(((Fonts.Family) t8).getLang(), str)), Boolean.valueOf(kotlin.jvm.internal.m.a(((Fonts.Family) t6).getLang(), str)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listS0, linkedHashSet, weight, str2);
            filterFamilies(listS1, linkedHashSet, weight, str2);
            return m.a1(linkedHashSet);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(Map<String, Fonts.Family> fontFamilies, Fonts.FontOpts opts) {
            kotlin.jvm.internal.m.f(fontFamilies, "fontFamilies");
            kotlin.jvm.internal.m.f(opts, "opts");
            return processMatchingFamilies(nz.n.W(nz.n.R(x.T(fontFamilies), new FontHelper$Companion$findMatches$matchingFamiliesSequence$1(opts.getFamilyName(), opts.getLang())), FontHelper$Companion$findMatches$matchingFamiliesSequence$2.INSTANCE), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        public final Fonts.Font getFallbackFont(Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return (Fonts.Font) m.s0(getFallbackFonts(fontOpts));
        }

        public final byte[] getFallbackFontBytes(Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(fontOpts);
            if (fallbackFont != null) {
                return FontHelper.Companion.getFontBytes(fallbackFont);
            }
            return null;
        }

        public final List<Fonts.Font> getFallbackFonts(Fonts.FontOpts opts) {
            kotlin.jvm.internal.m.f(opts, "opts");
            List<Fonts.Family> systemFontList = getSystemFontList();
            return systemFontList.isEmpty() ? r.f50854a : findMatches$kotlin_release(systemFontList, opts);
        }

        public final byte[] getFontBytes(Fonts.Font font) {
            kotlin.jvm.internal.m.f(font, "font");
            File fontFile = getFontFile(font);
            if (fontFile != null) {
                return k.S(fontFile);
            }
            return null;
        }

        public final File getFontFile(Fonts.Font font) {
            Object objInvoke;
            kotlin.jvm.internal.m.f(font, "font");
            t tVarW = nz.n.W(m.g0(SystemFontsParser.Companion.getSYSTEM_FONTS_PATHS$kotlin_release()), new FontHelper$Companion$getFontFile$1(font));
            Iterator it = tVarW.f44348a.iterator();
            while (it.hasNext()) {
                objInvoke = tVarW.f44349b.invoke(it.next());
                if (((File) objInvoke).exists()) {
                    return (File) objInvoke;
                }
            }
            objInvoke = null;
            return (File) objInvoke;
        }

        public final List<Fonts.Family> getSystemFontList() {
            List<Fonts.Family> listLoadFontList$kotlin_release;
            List<Fonts.Family> list = (List) FontHelper.familiesListCache.get();
            if (list != null) {
                return list;
            }
            synchronized (this) {
                listLoadFontList$kotlin_release = (List) FontHelper.familiesListCache.get();
                if (listLoadFontList$kotlin_release == null) {
                    listLoadFontList$kotlin_release = FontHelper.Companion.loadFontList$kotlin_release();
                }
            }
            return listLoadFontList$kotlin_release;
        }

        @c
        public final Map<String, Fonts.Family> getSystemFonts() {
            Map<String, Fonts.Family> mapLoadFonts$kotlin_release;
            Map<String, Fonts.Family> map = (Map) FontHelper.familiesMapCache.get();
            if (map != null) {
                return map;
            }
            synchronized (this) {
                mapLoadFonts$kotlin_release = (Map) FontHelper.familiesMapCache.get();
                if (mapLoadFonts$kotlin_release == null) {
                    mapLoadFonts$kotlin_release = FontHelper.Companion.loadFonts$kotlin_release();
                }
            }
            return mapLoadFonts$kotlin_release;
        }

        public final List<Fonts.Family> loadFontList$kotlin_release() throws IOException {
            Object objInvoke;
            List<Fonts.Family> fontsXML$kotlin_release;
            t tVarW = nz.n.W(ry.l.B(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH}), FontHelper$Companion$loadFontList$validPath$1.INSTANCE);
            Iterator it = tVarW.f44348a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = tVarW.f44349b.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            List<Fonts.Family> list = r.f50854a;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXML$kotlin_release = SystemFontsParser.Companion.parseFontsXML$kotlin_release(fileInputStream);
                    } catch (Exception e8) {
                        e8.getMessage();
                        fontsXML$kotlin_release = list;
                    }
                    fileInputStream.close();
                    if (fontsXML$kotlin_release != null) {
                        list = fontsXML$kotlin_release;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o.m(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
            List<Fonts.Family> listFilterNonExistingFonts = filterNonExistingFonts(list);
            FontHelper.familiesListCache.set(listFilterNonExistingFonts);
            return listFilterNonExistingFonts;
        }

        public final Map<String, Fonts.Family> loadFonts$kotlin_release() throws IOException {
            Object objInvoke;
            Map<String, Fonts.Family> fontsXMLMap$kotlin_release;
            t tVarW = nz.n.W(ry.l.B(new String[]{SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH}), FontHelper$Companion$loadFonts$validPath$1.INSTANCE);
            Iterator it = tVarW.f44348a.iterator();
            do {
                if (!it.hasNext()) {
                    objInvoke = null;
                    break;
                }
                objInvoke = tVarW.f44349b.invoke(it.next());
            } while (!((File) objInvoke).exists());
            File file = (File) objInvoke;
            Map<String, Fonts.Family> map = s.f50855a;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        fontsXMLMap$kotlin_release = SystemFontsParser.Companion.parseFontsXMLMap$kotlin_release(fileInputStream);
                    } catch (Exception e8) {
                        e8.getMessage();
                        fontsXMLMap$kotlin_release = map;
                    }
                    fileInputStream.close();
                    if (fontsXMLMap$kotlin_release != null) {
                        map = fontsXMLMap$kotlin_release;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        o.m(fileInputStream, th2);
                        throw th3;
                    }
                }
            }
            Map<String, Fonts.Family> mapFilterNonExistingFonts = filterNonExistingFonts(map);
            FontHelper.familiesMapCache.set(mapFilterNonExistingFonts);
            return mapFilterNonExistingFonts;
        }

        public final void resetForTesting() {
            FontHelper.familiesMapCache.set(null);
            FontHelper.familiesListCache.set(null);
        }

        private Companion() {
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, List list, Fonts.FontOpts fontOpts, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.findMatches$kotlin_release((List<Fonts.Family>) list, fontOpts);
        }

        public final List<Fonts.Font> findMatches$kotlin_release(List<Fonts.Family> fontFamiliesList, Fonts.FontOpts opts) {
            kotlin.jvm.internal.m.f(fontFamiliesList, "fontFamiliesList");
            kotlin.jvm.internal.m.f(opts, "opts");
            return processMatchingFamilies(nz.n.R(m.g0(fontFamiliesList), new FontHelper$Companion$findMatches$matchingFamiliesSequence$3(opts.getFamilyName(), opts.getLang())), opts.getLang(), opts.getWeight(), opts.getStyle());
        }

        private final List<Fonts.Family> filterNonExistingFonts(List<Fonts.Family> list) {
            if (list.isEmpty()) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            for (Fonts.Family family : list) {
                Map<Fonts.Weight, List<Fonts.Font>> fonts = family.getFonts();
                LinkedHashMap linkedHashMap = new LinkedHashMap(x.W(fonts.size()));
                Iterator<T> it = fonts.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    List list2 = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list2) {
                        if (FontHelper.Companion.getFontFile((Fonts.Font) obj) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    linkedHashMap.put(key, arrayList2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (!((List) entry2.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                Fonts.Family family2 = !linkedHashMap2.isEmpty() ? new Fonts.Family(family.getName(), family.getVariant(), family.getLang(), linkedHashMap2) : null;
                if (family2 != null) {
                    arrayList.add(family2);
                }
            }
            return arrayList;
        }
    }
}
