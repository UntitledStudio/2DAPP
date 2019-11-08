package td.towers.strategies;

import java.util.List;
import td.entities.enemies.EnemyUnit;
import td.towers.Tower;
import td.waves.WaveManager;

public class FirstUnitStrategy extends TargetStrategy {
    @Override
    public EnemyUnit findTarget(Tower tower) {
        List<EnemyUnit> index = WaveManager.getWave().getEnemyIndex();
        
        /**
         * This logic is flawed. 
         * We need to look for the enemy that has traveled the furthest, not the spawn queue position.
         */
        
        for(int i = 0; i < index.size(); i++) {
            EnemyUnit unit = index.get(i);
            
            if(unit.isWithinTowerRange(tower)) {
                return unit;
            }
        }
        return null;
    }
    
    @Override
    public String getName() {
        return "First";
    }
}