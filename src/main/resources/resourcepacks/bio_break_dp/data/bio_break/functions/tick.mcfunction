execute if score bio_break bio_break matches 1 run tag @a add bioBreak
execute if score bio_break bio_break matches 0 run tag @a remove bioBreak

bossbar set bio_break:timer players @a
execute as @a[tag=bioBreak] run bossbar set bio_break:timer visible true
execute as @a[tag=!bioBreak] run bossbar set bio_break:timer visible false