package com.ohgiraffers;

import java.util.List;
import java.util.Map;

public interface Mapper {
    List<MenuDTO> selectSuitMenu(Map<String,String> map);
}
